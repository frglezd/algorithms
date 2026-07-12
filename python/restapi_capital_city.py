import requests


def getCapitalCity(country):
    api_request = requests.get('https://jsonmock.hackerrank.com/api/countries?name='+country)
    data = api_request.json()['data']
    if(len(data[0]['capital'])==0):
        return -1
    return data[0]['capital']

country = input()
print(getCapitalCity(country))