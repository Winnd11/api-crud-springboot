## SpringBoot Api
CRUD Api Rest build with spring boot, JPA, and H2 database

### Intalation

Java >= 8
PostMan

### Getting Started
1. Clone this repo
```git
git clone https://github.com/Winnd11/api-springboot.git
```

2. run main

the app will run at http://localhost:5500

### Get Methods

I recommend using postman for get method and post method.

Get all users ```db/user/get```

Get a specific user by id ```db/user/get/"id"```

### Post Methods
Delete a specific user by id  ```db/delete/"id"```

Insert user  ```db/insert```

The post method to add a user you must use in row format and type json

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


