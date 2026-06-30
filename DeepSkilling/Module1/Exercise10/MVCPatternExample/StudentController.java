// StudentController.java

// Controller Class
public class StudentController {

    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    // Update Student Name
    public void setStudentName(String name) {
        model.setName(name);
    }

    // Get Student Name
    public String getStudentName() {
        return model.getName();
    }

    // Update Student ID
    public void setStudentId(int id) {
        model.setId(id);
    }

    // Get Student ID
    public int getStudentId() {
        return model.getId();
    }

    // Update Student Grade
    public void setStudentGrade(String grade) {
        model.setGrade(grade);
    }

    // Get Student Grade
    public String getStudentGrade() {
        return model.getGrade();
    }

    // Display Student Details
    public void updateView() {
        view.displayStudentDetails(
                model.getName(),
                model.getId(),
                model.getGrade());
    }
}