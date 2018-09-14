package cap.action;

import com.sun.xml.internal.ws.addressing.model.ActionNotSupportedException;
import org.apache.struts2.convention.annotation.InterceptorRefs;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import static com.opensymphony.xwork2.Action.SUCCESS;

@ParentPackage("login")
@Namespace("/")
@InterceptorRefs(@InterceptorRef(value = "mystack"))
@Results({@Result(name = "success", location = "/index.jsp"),
        @Result(name = "login", location = "/login.jsp")})
public class TimerAction extends ActionSupport {

    @Action(value = "count", results = {
            @Result(name = "success", location = "result.jsp")})
public class TimerAction extends ActionNotSupportedException {

        @Action(value = "count", results = {
                @Result(name = "success", location = "result.jsp")
        })

        public String count() {
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }
}

