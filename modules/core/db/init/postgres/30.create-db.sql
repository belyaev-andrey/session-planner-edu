insert into SEC_USER
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, LOGIN, LOGIN_LC, PASSWORD, PASSWORD_ENCRYPTION, NAME, FIRST_NAME, LAST_NAME, MIDDLE_NAME, POSITION_, EMAIL, LANGUAGE_, TIME_ZONE, TIME_ZONE_AUTO, ACTIVE, CHANGE_PASSWORD_AT_LOGON, GROUP_ID, GROUP_NAMES, IP_MASK, SYS_TENANT_ID)
values ('4cf84f6e-5b08-56c6-903c-13f4b2956122', 1, '2020-09-20 21:36:44', 'admin', '2020-09-20 21:36:44', null, null, null, 'jane', 'jane', '$2a$10$.wfSAqLHxOzdgik54xlDaekORc9yhOi.2SOuJAqnbipMqFYj5f10a', 'bcrypt', 'Jane Doe', 'Jane', 'Doe', null, null, 'jane.doe@sessions.com', 'en', null, null, true, false, '0fa2b1a5-1d68-4d69-9fbd-dff348347f93', null, null, null);
insert into SEC_USER
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, LOGIN, LOGIN_LC, PASSWORD, PASSWORD_ENCRYPTION, NAME, FIRST_NAME, LAST_NAME, MIDDLE_NAME, POSITION_, EMAIL, LANGUAGE_, TIME_ZONE, TIME_ZONE_AUTO, ACTIVE, CHANGE_PASSWORD_AT_LOGON, GROUP_ID, GROUP_NAMES, IP_MASK, SYS_TENANT_ID)
values ('16000146-9276-9c60-dd77-0cb993181b3b', 1, '2020-09-20 21:36:04', 'admin', '2020-09-20 21:36:04', null, null, null, 'john', 'john', '$2a$10$xAE./wJJD0jZLbDN4r0.ruGP9rlkj8j.FuoQV9HqLeZuXaHZh05P6', 'bcrypt', 'John Doe', 'John', 'Doe', null, null, 'john.doe@sessions.com', 'en', null, null, true, false, '0fa2b1a5-1d68-4d69-9fbd-dff348347f93', null, null, null);


insert into SESSIONPLANNER_SPEAKER
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, FIRST_NAME, LAST_NAME, EMAIL)
values ('6692bee6-e678-2dac-e029-040aaa8c9857', 2, '2020-09-20 17:00:09', 'admin', '2020-09-20 17:44:24', 'admin', null, null, 'Jane', 'Doe', 'jane.doe@sessions.com');
insert into SESSIONPLANNER_SPEAKER
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, FIRST_NAME, LAST_NAME, EMAIL)
values ('af8eee5f-9716-8492-0488-9cacb8eed556', 1, '2020-09-20 16:59:03', 'admin', '2020-09-20 16:59:03', null, null, null, 'John', 'Doe', 'john.doe@sessions.com');

insert into SESSIONPLANNER_SESSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, TOPIC, START_DATE, DURATION, SPEAKER_ID, DESCRIPTION)
values ('300fe12b-d6f9-c734-b71f-6a71db44dadf', 1, '2020-09-20 17:10:47', 'admin', '2020-09-20 17:10:47', null, null, null, 'CUBA 7.2 - New features', '2020-09-21 10:00', 1, 'af8eee5f-9716-8492-0488-9cacb8eed556', 'Поговорим о новых возможностях CUBA 7.2');
insert into SESSIONPLANNER_SESSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, TOPIC, START_DATE, DURATION, SPEAKER_ID, DESCRIPTION)
values ('5a95a181-91d1-a897-d125-166681699b13', 2, '2020-09-20 17:11:36', 'admin', '2020-09-20 17:11:56', 'admin', null, null, 'CUBA REST', '2020-09-21 11:00', 1, '6692bee6-e678-2dac-e029-040aaa8c9857', 'Рассмотрим генерацию REST методов и создание контроллеров REST');
insert into SESSIONPLANNER_SESSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, TOPIC, START_DATE, DURATION, SPEAKER_ID, DESCRIPTION)
values ('b7af8dcd-c1a0-65ff-2506-65b5b530251b', 1, '2020-09-20 17:13:07', 'admin', '2020-09-20 17:13:07', null, null, null, 'CUBA Entity Audit', '2020-09-21 12:00', 1, 'af8eee5f-9716-8492-0488-9cacb8eed556', 'Рассмотрим включение аудита данных в CUBA');
insert into SESSIONPLANNER_SESSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, TOPIC, START_DATE, DURATION, SPEAKER_ID, DESCRIPTION)
values ('73d7fdab-5cce-2f04-16cc-876e79e08417', 1, '2020-09-20 17:13:57', 'admin', '2020-09-20 17:13:57', null, null, null, 'CUBA Dynamic Attributes', '2020-09-21 13:00', 1, '6692bee6-e678-2dac-e029-040aaa8c9857', 'Рассмотрим управление динамическими атрибутами в CUBA');
insert into SESSIONPLANNER_SESSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, TOPIC, START_DATE, DURATION, SPEAKER_ID, DESCRIPTION)
values ('9b0581b0-690a-4d25-9b0e-5d7c9ada91f7', 1, '2020-09-20 17:39:45', 'admin', '2020-09-20 17:39:45', null, null, null, 'CUBA Reporting', '2020-09-22 10:00', 1, 'af8eee5f-9716-8492-0488-9cacb8eed556', 'Будем интегрировать отчеты в Ui');
insert into SESSIONPLANNER_SESSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, TOPIC, START_DATE, DURATION, SPEAKER_ID, DESCRIPTION)
values ('8b724c26-a03e-2754-7dd4-f79e53780889', 1, '2020-09-20 17:40:48', 'admin', '2020-09-20 17:40:48', null, null, null, 'CSS Hot Deploy', '2020-09-22 11:00', 1, '6692bee6-e678-2dac-e029-040aaa8c9857', 'Изучим создание новых тем для UI');
insert into SESSIONPLANNER_SESSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, TOPIC, START_DATE, DURATION, SPEAKER_ID, DESCRIPTION)
values ('36e51b40-47a6-3bff-b15e-12e96406e08b', 1, '2020-09-20 17:41:49', 'admin', '2020-09-20 17:41:49', null, null, null, 'ReactJS Client', '2020-09-22 12:00', 2, 'af8eee5f-9716-8492-0488-9cacb8eed556', 'Генерация ReactJS клиента и небольшая модификация.');
insert into SESSIONPLANNER_SESSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, TOPIC, START_DATE, DURATION, SPEAKER_ID, DESCRIPTION)
values ('6a37a6cc-1d58-0405-45d4-823be44acfd4', 1, '2020-09-20 17:43:25', 'admin', '2020-09-20 17:43:25', null, null, null, 'CUBA Custom UI Component', '2020-09-22 14:00', 1, 'af8eee5f-9716-8492-0488-9cacb8eed556', 'Создание собственного компонента и интеграция его в  UI');
insert into SESSIONPLANNER_SESSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, TOPIC, START_DATE, DURATION, SPEAKER_ID, DESCRIPTION)
values ('af76725d-67af-6cc7-b377-e720e7ab60d8', 1, '2020-09-20 17:44:10', 'admin', '2020-09-20 17:44:10', null, null, null, 'CUBA Portal', '2020-09-22 15:00', 1, '6692bee6-e678-2dac-e029-040aaa8c9857', 'Обзор модуля и принципы разработки портальных решений');
insert into SESSIONPLANNER_SESSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, TOPIC, START_DATE, DURATION, SPEAKER_ID, DESCRIPTION)
values ('761e64c4-3547-b241-5c9f-a76fe38e79b7', 2, '2020-09-20 17:45:54', 'admin', '2020-09-20 17:46:07', 'admin', null, null, 'CUBA Deploy', '2020-09-23 10:00', 4, 'af8eee5f-9716-8492-0488-9cacb8eed556', 'Развертывание CUBA приложений. Кластеризация. Docker.');
insert into SESSIONPLANNER_SESSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, TOPIC, START_DATE, DURATION, SPEAKER_ID, DESCRIPTION)
values ('ee3c30e2-27cc-9365-0588-3c0e60381a28', 1, '2020-09-20 17:47:38', 'admin', '2020-09-20 17:47:38', null, null, null, 'CUBA Cloud Storage', '2020-09-24 10:00', 1, 'af8eee5f-9716-8492-0488-9cacb8eed556', 'Рассмотрим S3 file storage и Azure File Storage');
insert into SESSIONPLANNER_SESSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, TOPIC, START_DATE, DURATION, SPEAKER_ID, DESCRIPTION)
values ('15a92ac6-4181-8092-c868-1cf789bfdec1', 1, '2020-09-20 17:48:34', 'admin', '2020-09-20 17:48:34', null, null, null, 'CUBA Deploy Check-List', '2020-09-24 11:00', 1, '6692bee6-e678-2dac-e029-040aaa8c9857', 'Рассмотрим приблизительный список действий, которые надо выполнить перед развертыванием.');
insert into SESSIONPLANNER_SESSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, TOPIC, START_DATE, DURATION, SPEAKER_ID, DESCRIPTION)
values ('270900a0-58e2-d500-a0f3-cee55311f2ec', 1, '2020-09-20 17:49:18', 'admin', '2020-09-20 17:49:18', null, null, null, 'Monitoring', '2020-09-24 13:00', 2, 'af8eee5f-9716-8492-0488-9cacb8eed556', 'Средства мониторинга в CUBA. JavaMelody.');

