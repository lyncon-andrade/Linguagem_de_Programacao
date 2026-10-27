public class EquipeTecnica {
    Membro[] membros;
    Tecnico tecnico;
   
    public EquipeTecnica(Membro[] membros, Tecnico tecnico){
        setMembros(membros);
        setTecnico(tecnico);
    }
    public void setMembros(Membro[] membros) {
        this.membros = membros;
    }
    public Membro[] getMembros() {
        return membros;
    }
    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }
    public Tecnico getTecnico() {
        return tecnico;
    }
}