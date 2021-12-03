class stringReplacer implements StringTransformer {
    char to_replace;
    char replacer;
    public stringReplacer(char to_replace, char replacer){
        this.to_replace=to_replace;
        this.replacer= replacer;
    }
    public void execute(StringDrink drink) {
        String text = drink.getText();
        text=text.replace(to_replace,replacer);
        drink.setText(text);
    }
}
