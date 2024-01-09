import requests;

apidata = requests.get("https://jsonplaceholder.typicode.com/posts/1")
print(apidata.json())