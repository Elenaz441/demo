1) создать контроллер, в котором:
    - endpoint, который на вход будет принимать данные в виде:
        {
               "name": "Мой список дел",
               "events": ["дело1", "delo2", "delo3"]
         }
    и сохранять их в базу

   - endpoint, который будет отдавать данные из бд в виде:
      [
          {
                "name": "Мой список дел",
                "events": ["дело1", "delo2", "delo3"]
          },
          {
               "name": "Мой список дел2",
               "events": ["дело1", "delo2", "delo3"]
           }
      ]

    - Проект должен запускаться одной кнопки (не должно быть необходимости руками запускать скрипты)

2) спроектировать структуру БД для этих данных. Была использована бд Postgras.
![image](https://user-images.githubusercontent.com/102030455/230796447-2dcd1a41-fadb-435a-b6d1-9bf803a5750c.png)
