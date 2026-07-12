import requests

def fetch_medical_records(userid):

    url = f"https://jsonmock.hackerrank.com/api/medical_records?userId={userid}"
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

def calculate_average_body_temperature(records):

    if not records:
        return None
    total_temperature = 0.0
    count = 0
    for record in records:
        if 'vitals' in record and 'bodyTemperature' in record['vitals']:
            total_temperature += float(record['vitals']['bodyTemperature'])
            count += 1
    if count > 0:
        return total_temperature / count
    else:
        return None

def get_average_body_temperature(userid):

    records = fetch_medical_records(userid)
    average_temperature = calculate_average_body_temperature(records)
    return average_temperature


usr = input()
print(get_average_body_temperature(usr))