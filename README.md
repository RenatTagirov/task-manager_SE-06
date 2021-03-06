**Описание проекта**

TAST MANAGER - программа, в которой можно создавать свои проекты и задачи зарегистрировавшись под обычным пользователем или администратором.
Во время регистрации ваш пароль будет закодирован по MD5 алгоритму.
В каждый проект можно добавлять описание, а так же его редактировать. Каждую задачу можно создавать в общем списке или внутри созданного проекта, так же добавлять задачу в проект.
При просмотре проекта или задачи - будет выведено название, описание, время и дата создания и изменения (если был изменен).
Каждому проекту и задаче присное свой уникальный UUID код.

**Требования к SOFTWARE**\
MacOs\
Windows\
Linux

**Стек технологий**\
IntelliJ IDEA Ultimate\
Java SE Development 8\
Apache Maven version 4.0.0\
Git\
UUID\
MVC(repository, service)\
MD5

**Разработчик**\
Тагиров Ренат\
rena.tagirov@gmail.com

**Команды для работы с приложением**\

registration (регистрация)\
login (войти в свой профиль)\
exit (выйти из своего профиля)\
help (показать все команды)\

show profile (посмотреть свой профиль)\
update profile (изменить свой профиль: имя или логин)\
update password (поменять свой пароль)\
list all (посмотреть все проекты и задачи)\
clear all (удалить все проекты и задачи)\

project create (создать новый проект)\
project update (изменить название или описание проекта)\
project list (показать все проекты)\
project remove (удалить проект)\
project clear (удалить все проекты)\

task create (создать новую задачу)\
task create to project (создать новую задачу в проекте)\
task update (изменить название или описание задачи)\
task update to project (изменить название или описание задачи в проекте)\
task list (показать задачи)\
task list to project (показать задачи в проекте)\
task remove (удалить задачу)\
task remove to project (удалить задачу в проекте)\
task clear (удалить задачи)\
task clear to project (удалить задачи в проекте)\
task add to project (поместить задачу в проект)\
list all (показать весь список)\
clear all (удалить весь список)\

если вы администратор:\
show user (посмотреть профиль пользователя)\
show all users (посмотреть всех пользователей)\
remove user (удалить пользователя)\
show projects user (посмотреть проекты пользователя)\
show tasks user (посмотреть задачи пользователя)\
show tasks to project user (посмотреть задачи внутри проекта у пользователя)\
