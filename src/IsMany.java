public class IsMany {
    private boolean isMany;
    private boolean isTens;

    public IsMany() {
        this.isMany = false;
        this.isTens = false;
    }

    public boolean isTens() {
        return isTens;
    }

    public void setTens(boolean tens) {
        isTens = tens;
    }

    public boolean isMany() {
        return isMany;
    }

    public void setMany(boolean many) {
        isMany = many;
    }
}
