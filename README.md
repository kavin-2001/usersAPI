# usersAPI

This contains the back-end as well as front-end projects.

Back-end:
In the back-end project I have created and exposed a REST Web Service which will also populate some test data.
This will act as a Mock API for my UI project.

Sample Queries and responses:

1. Get All users

Request: http://localhost:8080/getuserslist
Response: 
[
  {
    "name": "Kavin Periyasamy",
    "age": 20,
    "dob": "12-07-2001",
    "firstName": "Kavin",
    "lastName": "Periyasamy",
    "more": {
      "address_line1": "3",
      "address_line2": "Thathipalayam",
      "address_line3": "Konur Post",
      "phone": "5645432187"
    }
  },
  {
    "name": "Kumar Maran",
    "age": 21,
    "dob": "1-05-2000",
    "firstName": "Kumar",
    "lastName": "Maran",
    "more": {
      "address_line1": "3",
      "address_line2": "Keerambur",
      "address_line3": "Namakkal Post",
      "phone": "5645333187"
    }
  }
]
