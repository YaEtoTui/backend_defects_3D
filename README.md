# backend_defects_3D
Бэкенд по ПО для мобильного приложения(Справочник по 3D дефектам)

| API | Описание | Текст Запроса | Текст ответа |
| --- | -------- | ------------- | ------------ |
| GET /api/defects | Получение инфы по дефектам | Нет | List<Defect> |
| GET /api/defects/{id} | Получение инфы по дефекту через id | Нет | Defect |
| GET /api/defects/picture/{id} | Получение изображения | Нет | URL |

id в диапазоне от 1 до 20(включительно)

# Defect

```py
[
  {
    "nameDefect": "nameDefect",
    "description": "description",
    "reasons": "reasons",
    "solutions": "solutions",
    "picture": "путь до картинки(внутри проекта)":
  }
]
```
