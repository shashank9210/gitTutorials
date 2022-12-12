public class Register {

    private String name;
    private String password;

    public Register() {
    }

    public Register(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Register)) return false;

        Register register = (Register) o;

        if (getName() != null ? !getName().equals(register.getName()) : register.getName() != null) return false;
        return getPassword() != null ? getPassword().equals(register.getPassword()) : register.getPassword() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getPassword() != null ? getPassword().hashCode() : 0);
        return result;
    }
}
