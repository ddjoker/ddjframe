/*==============================================================*/
/* table: user                                                 */
/*==============================================================*/
DROP TABLE IF EXISTS user CASCADE;
CREATE TABLE user (
  usr_guid    VARCHAR(36)   NOT NULL PRIMARY KEY
  COMMENT '用户id',
  status      DECIMAL(2)    NOT NULL DEFAULT '1'
  COMMENT '状态',
  first_name  VARCHAR(196)  NOT NULL,
  last_name   VARCHAR(196)  NOT NULL,
  description VARCHAR(2048) NULL
  COMMENT '描述',
  created_by  VARCHAR(36)   NOT NULL,
  created_dt  TIMESTAMP     NOT NULL DEFAULT current_timestamp,
  record_flag VARCHAR(2)    NOT NULL DEFAULT '01',
  updated_by  VARCHAR(36)   NULL,
  updated_dt  TIMESTAMP     NULL
);

ALTER TABLE user
  COMMENT = '用户表';

DROP TABLE IF EXISTS user_settings CASCADE;
CREATE TABLE user_settings (
  usr_guid    VARCHAR(36) NOT NULL PRIMARY KEY
  COMMENT '用户表（user)id',
  enable_sync BOOLEAN     NOT NULL DEFAULT FALSE
  COMMENT '启用客户端登录',
  login_mode  VARCHAR(10) NOT NULL DEFAULT 'default'
  COMMENT '登录方式',
  record_flag VARCHAR(2)  NOT NULL DEFAULT '01',
  updated_by  VARCHAR(36) NULL,
  updated_dt  TIMESTAMP   NULL
);

ALTER TABLE user_settings
  COMMENT = '用户设置表';


DROP TABLE IF EXISTS user_preferences CASCADE;
CREATE TABLE user_preferences (
  usr_guid    VARCHAR(36) NOT NULL PRIMARY KEY
  COMMENT '用户表（user)id',
  timezone_id VARCHAR(2)  NOT NULL
  COMMENT '时区',
  -- theme_id      varchar(2)  not null default '-1'
  -- comment  '样式',
  lang_id     VARCHAR(6)  NULL
  COMMENT '语言',
  search_mode VARCHAR(10) NOT NULL  DEFAULT 'classic'
  COMMENT '搜索模式 经典/快照 classic/snapshots',
  record_flag VARCHAR(2)  NOT NULL  DEFAULT '01',
  updated_by  VARCHAR(36) NULL,
  updated_dt  TIMESTAMP   NULL
);

ALTER TABLE user_settings
  COMMENT = '用户选项表';

DROP TABLE IF EXISTS user_login_default CASCADE;
CREATE TABLE user_login_default (
  usr_guid    VARCHAR(36)  NOT NULL PRIMARY KEY
  COMMENT '用户表（user)id',
  login_name  VARCHAR(36)  NOT NULL,
  main_email  VARCHAR(256) NOT NULL,
  phone       VARCHAR(15)  NULL,
  password    VARCHAR(72)  NOT NULL,
  reset_login VARCHAR(1)   NOT NULL,
  created_by  VARCHAR(36)  NOT NULL,
  created_dt  TIMESTAMP    NOT NULL,
  record_flag VARCHAR(2)   NOT NULL DEFAULT '01',
  updated_by  VARCHAR(36)  NULL,
  updated_dt  TIMESTAMP    NULL,
  CONSTRAINT user_login_default_login_name_uindex
  UNIQUE (login_name),
  CONSTRAINT user_login_default_main_email_uindex
  UNIQUE (main_email)
);

ALTER TABLE user
  COMMENT = '用户默认登录模式';

DROP TABLE IF EXISTS user_login_key CASCADE;
CREATE TABLE user_login_key (
  usr_guid    VARCHAR(36) NOT NULL PRIMARY KEY
  COMMENT '用户表（user)id',
  key_uid     VARCHAR(32) NOT NULL,
  key_seed    VARCHAR(32) NOT NULL,
  key_flag    BOOLEAN     NOT NULL    DEFAULT FALSE,
  created_by  VARCHAR(36) NOT NULL,
  created_dt  TIMESTAMP   NOT NULL,
  record_flag VARCHAR(2)  NOT NULL    DEFAULT '01',
  updated_by  VARCHAR(36) NULL,
  updated_dt  TIMESTAMP   NULL
);

ALTER TABLE user
  COMMENT = '用户key登录模式';

DROP TABLE IF EXISTS user_login_ldap CASCADE;
CREATE TABLE user_login_ldap (
  usr_guid    VARCHAR(36) NOT NULL PRIMARY KEY
  COMMENT '用户表（user)id',
  base        VARCHAR(32) NOT NULL,
  cn          VARCHAR(32) NOT NULL,
  status      VARCHAR(20) NOT NULL DEFAULT 'valid',
  created_by  VARCHAR(36) NOT NULL,
  created_dt  TIMESTAMP   NOT NULL,
  record_flag VARCHAR(2)  NOT NULL DEFAULT '01',
  updated_by  VARCHAR(36) NULL,
  updated_dt  TIMESTAMP   NULL
);

ALTER TABLE user
  COMMENT = '用户ldap登录模式';