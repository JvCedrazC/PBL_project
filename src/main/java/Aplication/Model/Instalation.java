package Aplication.Model;

import java.util.List;
public class Instalation extends Services{
    private static List<String> programs;
    String program;

    public List<String> getPrograms() {
        return programs;
    }

    public void setProgram(String program){
        this.program = program;
    }
    private void addPrograms(String program){
        setProgram(program);
        programs.add(this.program);
    }
}
