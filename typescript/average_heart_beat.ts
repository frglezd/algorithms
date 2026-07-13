import * as readline from "readline";

interface RunnerRecord {
  avgheartbeat?: string | number;
  [key: string]: unknown;
}

interface MarathonResponse {
  data?: RunnerRecord[];
  total_pages?: number;
}

async function fetchRunnerRecords(username: string): Promise<RunnerRecord[]> {
  const url = "https://jsonmock.hackerrank.com/api/marathon";
  const records: RunnerRecord[] = [];
  let page = 1;
  let totalPages = 1; // initialize with at least one page to enter the loop

  // Fetch all pages of records
  while (page <= totalPages) {
    const response = await fetch(`${url}?name=${encodeURIComponent(username)}&page=${page}`);
    const data: MarathonResponse = await response.json();
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

function calculateAverageHeartbeat(records: RunnerRecord[]): number | null {
  if (records.length === 0) {
    return null;
  }
  let totalAvgHeartbeat = 0;
  let count = 0;
  for (const record of records) {
    if (record.avgheartbeat !== undefined) {
      totalAvgHeartbeat += Number(record.avgheartbeat);
      count += 1;
    }
  }
  return count > 0 ? totalAvgHeartbeat / count : null;
}

async function getAvgHeartBeat(username: string): Promise<number | null> {
  const records = await fetchRunnerRecords(username);
  const averageHeartbeat = calculateAverageHeartbeat(records);
  return averageHeartbeat === null ? null : Math.round(averageHeartbeat);
}

const rl = readline.createInterface({ input: process.stdin });
rl.question("", async (runner: string) => {
  // example: Rudy Collier
  console.log(await getAvgHeartBeat(runner));
  rl.close();
});
