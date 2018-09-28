package cap.action;

import cap.bean.User;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport{
     private User user;

     public String register(){
          return SUCCESS;
     }

      public User getUser(){
           return user;
      }
       public void  setUser(User user){
          this.user = user;
       }
}
