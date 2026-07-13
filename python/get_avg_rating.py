import requests

def fetch_city_records(city_name):

    url = f"https://jsonmock.hackerrank.com/api/food_outlets?city={city_name}"
    records = []
    page = 1
    total_pages = 1 # initialize with at least one page to enter the loop

    # Fetch all pages of records

    while page <= total_pages:
        response = requests.get(url, params={'page': page})
        data = response.json()
        if 'data' in data:
            records.extend(data['data'])
            total_pages = data['total_pages']
            page += 1
        else:
            break
    return records

def calculate_average_rating(records):

    if not records:
        return None
    total_avg_rating = 0.0
    count = 0
    for record in records:
        if 'user_rating' in record:
            total_avg_rating += float(record['user_rating']['average_rating'])
            count += 1
    if count > 0:
        return total_avg_rating / count
    else:
        return None
    
def get_avg_rating(city_name):

    records = fetch_city_records(city_name)
    average_rating = calculate_average_rating(records)
    return average_rating

city = input() # example: Denver
print(get_avg_rating(city))