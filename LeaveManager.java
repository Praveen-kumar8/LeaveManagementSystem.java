package leavemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class LeaveManager {
    // List to store leave requests
    private List<LeaveRequest> leaveRequests = new ArrayList<>();

    // Method to submit a leave request
    public void submitLeaveRequest(LeaveRequest request) {
        leaveRequests.add(request);
        System.out.println("Leave request submitted for: " + request.getEmployee().getName());
    }

    // Method to show all leave requests
    public void showAllLeaveRequests() {
        System.out.println("\nAll Leave Requests:");
        for (LeaveRequest request : leaveRequests) {
            System.out.println(request);
        }
    }

    // Method to show leave requests by status
    public void showLeaveRequestsByStatus(String status) {
        System.out.println("\nLeave Requests with Status: " + status);
        boolean found = false;
        for (LeaveRequest request : leaveRequests) {
            if (request.getStatus().equalsIgnoreCase(status)) {
                System.out.println(request);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No leave requests found with status: " + status);
        }
    }

    // Method to approve leave by employee ID
    public void approveLeave(int employeeId) {
        for (LeaveRequest request : leaveRequests) {
            if (request.getEmployee().getId() == employeeId && request.getStatus().equalsIgnoreCase("Pending")) {
                request.setStatus("Approved");
                System.out.println("Leave approved for: " + request.getEmployee().getName());
                return;
            }
        }
        System.out.println("No pending leave found for Employee ID: " + employeeId);
    }

    // Method to reject leave by employee ID
    public void rejectLeave(int employeeId) {
        for (LeaveRequest request : leaveRequests) {
            if (request.getEmployee().getId() == employeeId && request.getStatus().equalsIgnoreCase("Pending")) {
                request.setStatus("Rejected");
                System.out.println("Leave rejected for: " + request.getEmployee().getName());
                return;
            }
        }
        System.out.println("No pending leave found for Employee ID: " + employeeId);
    }
}
