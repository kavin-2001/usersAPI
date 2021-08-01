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

2.Get More details of a particular user:

Request: http://localhost:8080/getMoreDetails?userName=Kavin

Response:

{"address_line1":"3","address_line2":"Thathipalayam","address_line3":"Konur Post","phone":"5645432187"}

# UI Project:

On clicking of Load all users, there will be a Rest call from jquery which fetches the data and populated the option list as below in the screenshot.

![image](https://user-images.githubusercontent.com/79739295/127759542-5ce99385-7f87-4714-b9a4-f7683792e439.png)

![image](https://user-images.githubusercontent.com/79739295/127759569-8abbe657-e8a0-46c6-8dda-923aa7c6d0c5.png)

On selection of a user, it will again make a GET call to fetch the more details for the user.

![image](https://user-images.githubusercontent.com/79739295/127759583-53890fcc-6e60-4805-a452-98a2ef4c18ae.png)

