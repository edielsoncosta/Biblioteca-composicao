import java.util.List;

public class Library {
    private String nameLibrary;

    List<Department> departments;

    public Library(String nameLibrary, List<Department> departments) {
        this.nameLibrary = nameLibrary;
        this.departments = departments;
    }

    public String getNameLibrary() {
        return nameLibrary;
    }

    public void setNameLibrary(String nameLibrary) {
        this.nameLibrary = nameLibrary;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void removeDepartment(Department department) {
        departments.remove(department);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Biblioteca ").append(nameLibrary).append("\n");
        for (Department d : departments) {
            sb.append(d);
        }
        return sb.toString();
    }
}
