# backend_defects_3D
Бэкенд по ПО для мобильного приложения(Справочник по 3D дефектам)

| API | Описание | Текст Запроса | Текст ответа |
| --- | -------- | ------------- | ------------ |
| GET /api/defects | Получение инфы по дефектам(вместе с картинками) | Нет | List<Defect> |
| GET /api/defects/{id} | Получение инфы по дефекту через id | Нет | Defect |
| GET /api/defects/picture/{id} | Получение изображения | Нет | URL |

# Defect

```py
[
  {
    "nameDefect": "nameDefect",
    "description": "description",
    "description": "description",
    "reasons": "reasons",
    "picture": "путь до картинки":
  }
]
```
