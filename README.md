# backend_defects_3D
Бэкенд по ПО для мобильного приложения(Справочник по 3D дефектам)

| API | Описание | Текст Запроса | Текст ответа |
| --- | -------- | ------------- | ------------ |
| GET /api/defects | Получение инфы по дефектам(вместе с картинками) | Нет | Defect |

# Defect

```py
[
  {
    "id": "id",
    "text": "text_defect",
    "picture": "ссылка_на_картинку":
  }
]
```
