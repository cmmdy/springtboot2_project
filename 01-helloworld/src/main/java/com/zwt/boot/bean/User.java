package com.zwt.boot.bean;

/**
 * @Author zhouwentao
 * @Date 2021-07-31-14:56
 * @Email zhouwt@shuyilink.com
 */
public class User {

        private String name;
        private Integer age;


        public User() {
        }

        public User(String name, Integer age) {
                this.name = name;
                this.age = age;
        }


        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public Integer getAge() {
                return age;
        }

        public void setAge(Integer age) {
                this.age = age;
        }


        @Override
        public String  toString() {
                return "User{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
        }
}
