DROP TABLE IF EXISTS role CASCADE;
CREATE TABLE role
(
  id          BIGINT       NOT NULL AUTO_INCREMENT PRIMARY KEY
  COMMENT '角色id',
  role_name   VARCHAR(32)  NOT NULL
  COMMENT '角色名',
  role_sign   VARCHAR(128) NOT NULL
  COMMENT '角色标识,程序中判断使用,如"admin"',
  description VARCHAR(256) NULL
  COMMENT '角色描述,ui界面显示使用',
  created_by  VARCHAR(36)  NOT NULL,
  created_dt  TIMESTAMP    NOT NULL,
  record_flag VARCHAR(2)   NOT NULL DEFAULT '01',
  updated_by  VARCHAR(36)  NULL,
  updated_dt  TIMESTAMP    NULL
);
ALTER TABLE role
  COMMENT = '角色表';


DROP TABLE IF EXISTS user_role CASCADE;
CREATE TABLE user_role
(
  id      BIGINT      NOT NULL AUTO_INCREMENT
    PRIMARY KEY
  COMMENT '表id',
  user_id VARCHAR(36) NOT NULL
  COMMENT '用户id',
  role_id BIGINT      NOT NULL
  COMMENT '角色id'
);
ALTER TABLE user_role
  COMMENT = '用户与角色关联表';


DROP TABLE IF EXISTS permission CASCADE;
CREATE TABLE permission
(
  id              BIGINT       NOT NULL AUTO_INCREMENT
    PRIMARY KEY
  COMMENT '权限id',
  permission_name VARCHAR(32)  NOT NULL
  COMMENT '权限名',
  permission_sign VARCHAR(128) NOT NULL
  COMMENT '权限标识,程序中判断使用,如"user:create"',
  description     VARCHAR(256) NULL
  COMMENT '权限描述,ui界面显示使用',
  created_by      VARCHAR(36)  NOT NULL,
  created_dt      TIMESTAMP    NOT NULL,
  record_flag     VARCHAR(2)   NOT NULL DEFAULT '01',
  updated_by      VARCHAR(36)  NULL,
  updated_dt      TIMESTAMP    NULL
);
ALTER TABLE permission
  COMMENT = '权限表';


DROP TABLE IF EXISTS role_permission CASCADE;
CREATE TABLE role_permission
(
  id            BIGINT NOT NULL AUTO_INCREMENT
    PRIMARY KEY
  COMMENT '表id',
  role_id       BIGINT NOT NULL
  COMMENT '角色id',
  permission_id BIGINT NULL
  COMMENT '权限id'
);
ALTER TABLE role_permission
  COMMENT = '角色与权限关联表';
