package leavemanagementsystem;

public class LeaveRequest {
    private Employee employee;
    private String startDate;
    private String endDate;
    private String reason;
    private String status;
    public LeaveRequest(Employee employee,String startDate,String endDate,String reason,String status){
        this.employee=employee;
        this.startDate=startDate;
        this.endDate=endDate;
        this.reason=reason;
        this.status=status;
    }
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public String getEndDate() {
        return endDate;
    }
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Employee: " + employee.getName() + ", Leave Dates: " + startDate + " to " + endDate + ", Reason: " + reason + ", Status: " + status;
    }
}
