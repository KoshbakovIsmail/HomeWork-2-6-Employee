package pro.isa.EmployeerBook.Project.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpStatusCodeException;

public class DepartmentNotFoundException extends HttpStatusCodeException {
    public DepartmentNotFoundException(String message) {
        super(HttpStatus.NOT_FOUND,message);
    }
}
