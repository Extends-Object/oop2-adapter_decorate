package E4_adapter_decorate;

class ComboBuilder {
    private Combo combo;

    // Métodos para seleccionar el tipo de combo base
    public ComboBuilder comboBasico() {
        this.combo = new Basico();
        return this;
    }

    public ComboBuilder comboFamiliar() {
        this.combo = new Familiar();
        return this;
    }

    public ComboBuilder comboEspecial() {
        this.combo = new Especial();
        return this;
    }

    // Métodos para agregar adicionales (aplicando decoradores)
    public ComboBuilder conTomate() {
        this.combo = new Tomate(this.combo);
        return this;
    }

    public ComboBuilder conPapas() {
        this.combo = new Papas(this.combo);
        return this;
    }

    public ComboBuilder conCarne() {
        this.combo = new Carne(this.combo);
        return this;
    }

    public ComboBuilder conQueso() {
        this.combo = new Queso(this.combo);
        return this;
    }

    public Combo build() {
        if (combo == null) {
            throw new IllegalStateException("Debe seleccionar un tipo de combo base");
        }
        return this.combo;
    }

    public static ComboBuilder crear() {
        return new ComboBuilder();
    }
}