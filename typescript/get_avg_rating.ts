import * as readline from "readline";

interface FoodOutletRecord {
  user_rating?: {
    average_rating: number;
  };
  [key: string]: unknown;
}

interface FoodOutletResponse {
  data?: FoodOutletRecord[];
  total_pages?: number;
}

async function fetchCityRecords(cityName: string): Promise<FoodOutletRecord[]> {
  const url = "https://jsonmock.hackerrank.com/api/food_outlets";
  const records: FoodOutletRecord[] = [];
  let page = 1;
  let totalPages = 1; // initialize with at least one page to enter the loop

  // Fetch all pages of records
  while (page <= totalPages) {
    const response = await fetch(`${url}?city=${encodeURIComponent(cityName)}&page=${page}`);
    const data: FoodOutletResponse = await response.json();
    if (data.data) {
      records.push(...data.data);
      totalPages = data.total_pages ?? totalPages;
      page += 1;
    } else {
      break;
    }
  }
  return records;
}

function calculateAverageRating(records: FoodOutletRecord[]): number | null {
  if (records.length === 0) {
    return null;
  }
  let totalAvgRating = 0;
  let count = 0;
  for (const record of records) {
    if (record.user_rating !== undefined) {
      totalAvgRating += Number(record.user_rating.average_rating);
      count += 1;
    }
  }
  return count > 0 ? totalAvgRating / count : null;
}

async function getAvgRating(cityName: string): Promise<number | null> {
  const records = await fetchCityRecords(cityName);
  return calculateAverageRating(records);
}

const rl = readline.createInterface({ input: process.stdin });
rl.question("", async (city: string) => {
  // example: Denver
  console.log(await getAvgRating(city));
  rl.close();
});
