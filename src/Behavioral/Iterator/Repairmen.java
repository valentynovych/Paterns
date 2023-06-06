package Behavioral.Iterator;

public class Repairmen implements Collection{
    private String specialty;
    private String[] skills;

    public Repairmen(String specialty, String[] skills) {
        this.specialty = specialty;
        this.skills = skills;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    @Override
    public Iterator getIterator() {
        return new SkillIterator();
    }
    private class SkillIterator implements Iterator {
        int index;
        @Override
        public boolean hasNext() {
            if (index < skills.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return skills[index++];
        }
    }
}
