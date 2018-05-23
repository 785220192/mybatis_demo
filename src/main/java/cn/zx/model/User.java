package cn.zx.model;

import java.io.Serializable;

public class User  implements Serializable {

        /***
         * 用户ID
         */
        private Integer userid;
        /***
         * 用户名字
         */
        private String username;
        /***
         * 用户年龄
         */
        private Integer userage;
        public Integer getUserid() {
            return userid;
        }
        public void setUserid(Integer userid) {
            this.userid = userid;
        }
        public String getUsername() {
            return username;
        }
        public void setUsername(String username) {
            this.username = username;
        }
        public Integer getUserage() {
            return userage;
        }
        public void setUserage(Integer userage) {
            this.userage = userage;
        }

}
