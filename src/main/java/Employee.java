/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/10/">Lab 10 Description</a>
 */
public class Employee {
    /**
     * name of the employee.
     */
    private String name;
    /**
     * employee's manager.
     */
    private String manager;

    /**
     * Constructor for initialization.
     * @param inputName name of employee.
     * @param inputManager employee's manager.
     */
    public Employee(final String inputName, final String inputManager) {
        this.name = inputName;
        this.manager = inputManager;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param inputName new name for employee.
     */
    public void setName(final String inputName) {
        this.name = inputName;
    }

    /**
     * Getter for manager.
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     * @param inputManager new manager for employee.
     */
    public void setManager(final String inputManager) {
        this.manager = inputManager;
    }
}
