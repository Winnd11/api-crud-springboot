
# SpringBoot Api
CRUD Api Rest build with spring boot, JPA, and H2 database

## Intalation

- Java >= 8
- PostMan

## Getting Started
1. Clone this repo
```git
git clone https://github.com/Winnd11/api-springboot.git
```

2. run main

the app will run at http://localhost:5500

---

### Get Methods

| # | Get Users | Get User By Id |
| -- | -- | -- | 
| # | db/user/get | db/user/get/'id' | 

---

### Post Methods

| # | Insert User | Delete User | Update User
| -- | -- | -- | -- |
| # | db/insert | db/delete/'id' | db/update/'id' |


The post method to insert, delete and update a user must in row format and type json

```json
{

"name":  "dave",

"email":  "dave@gmail.com",

"department":  {

"id":  2

}

}
```

## MIT License
This project is licensed under MIT license, read more at <span><a href="https://docs.github.com/pt/repositories/managing-your-repositorys-settings-and-features/customizing-your-repository/licensing-a-repository">docs.github</span>


