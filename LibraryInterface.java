interface LibraryInterface {
    public boolean reservable(); 
    public boolean loanable();
    default int getLateFee() {
        return 20;
    }
}