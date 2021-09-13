package JavaPlayGround.JavaPlayGround.service;

import org.springframework.stereotype.Service;

@Service
public interface IEmployeeService {
    String getEmployee(String empId);
}
