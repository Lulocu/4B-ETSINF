import requests as req

resp = req.get("http://www.upv.es")

print(resp.text)
