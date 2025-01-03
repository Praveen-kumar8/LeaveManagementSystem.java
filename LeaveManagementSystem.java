package leavemanagementsystem;

public class LeaveManagementSystem {
    public static void main(String[] args) {
        // Create employees
        Employee emp1 = new Employee(1, "John Doe", "Software Engineer", 75000);
        Employee emp2 = new Employee(2, "Jane Smith", "HR Manager", 85000);

        // Leave Requests
        LeaveRequest leave1 = new LeaveRequest(emp1, "2024-12-31", "2025-01-02", "Vacation", "Pending");
        LeaveRequest leave2 = new LeaveRequest(emp2, "2024-12-28", "2024-12-30", "Family Emergency", "Pending");

        // Leave Management
        LeaveManager leaveManager = new LeaveManager();
        leaveManager.submitLeaveRequest(leave1);
        leaveManager.submitLeaveRequest(leave2);

        // Show pending leave requests
        System.out.println("\nPending Leave Requests:");
        leaveManager.showLeaveRequestsByStatus("Pending");

        // Approve or reject leaves
        leaveManager.approveLeave(1); // Approving the first leave request
        leaveManager.rejectLeave(2); // Rejecting the second leave request

        // Show all leave requests with updated statuses
        System.out.println("\nUpdated Leave Requests:");
        leaveManager.showAllLeaveRequests();
    }
}
