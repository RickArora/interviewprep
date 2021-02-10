def URLify(s1):
    url_string = s1.replace(" ", "%20")
    return url_string

print(URLify("Mr John Smith"))