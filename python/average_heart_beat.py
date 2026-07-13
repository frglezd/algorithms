import requests

def fetch_runner_records(username):

    url = f"https://jsonmock.hackerrank.com/api/marathon?name={username}"
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

def calculate_average_heartbeat(records):

    if not records:
        return None
    total_avg_heartbeat = 0.0
    count = 0
    for record in records:
        if 'avgheartbeat' in record:
            total_avg_heartbeat += float(record['avgheartbeat'])
            count += 1
    if count > 0:
        return total_avg_heartbeat / count
    else:
        return None
    
def get_avg_heart_beat(username):

    records = fetch_runner_records(username)
    average_heartbeat = calculate_average_heartbeat(records)
    return round(average_heartbeat)

runner = input() # example: Rudy Collier
print(get_avg_heart_beat(runner))