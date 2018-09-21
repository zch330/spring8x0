package cap.action;

import cap.bean.User;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ControlAction extends ActionSupport{
    private Map<String ,String > strMap = new HashMap<String, String>();
    private Map<String,User> userMap = new HashMap<String, User>();
    private List<User> userList = new ArrayList<User>();

    public String control() {
        strMap.put("1", "cdavtc1");
        strMap.put("2", "cdavtc2");
        strMap.put("3", "cdavtc3");
        User u1 = new User(1, "zch1", "zch1");
        User u2 = new User(2, "zch2", "zch");
        userMap.put("one", u1);
        userMap.put("two", u2);
        userList.add(u1);
        userList.add(u2);
        return SUCCESS;
    }

    private Map<String,String> getStrMap(){
        return strMap;
    }

    public void setStrMap(Map<String, String> strMap) {
        this.strMap = strMap;
    }

    public Map<String, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

}
