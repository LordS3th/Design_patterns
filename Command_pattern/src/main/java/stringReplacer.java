class stringReplacer implements StringTransformer {
    char to_replace;
    char replaced;
    public stringReplacer(char to_replace, char replaced){
        this.to_replace=to_replace;
        this.replaced= replaced;
    }
    public void execute(StringDrink drink) {
        String text = drink.getText();
        String res= "";
        for (int i =0; i < text.length();i++){
            if (text.charAt(i) == to_replace){
                res+=replaced;
            }
            else res+=text.charAt(i);
        }
        drink.setText(res);
    }
}
