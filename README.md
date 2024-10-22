
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

2. run maven
```git
./mvnw.cmd spring-boot:run
```

the app will run at http://localhost:5500

---

### Get Methods

| Get All Users | Get User By Id |
| -- | -- | 
| /db | /db/'id' | 

---

### Post Method

| Insert User |
| -- |
| /db |

---

### Delete Method

| Delete User By Id |
| -- |
| /db/'id' |

---

### Patch Method

| Update User |
| -- |
| /db |

---

The POST and PATCH methods must be in row format and use JSON type

```json
{
  "name": "dave",
  "email": "dave@gmail.com",
  "department": {
    "id": 2
  }
}

```

## MIT License
This project is licensed under MIT license, read more at <span><a href="https://docs.github.com/pt/repositories/managing-your-repositorys-settings-and-features/customizing-your-repository/licensing-a-repository">docs.github</span>


