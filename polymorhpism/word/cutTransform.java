package word;

public class cutTransform implements TextTransform {

    private Clipboard clipboard;

    public cutTransform(Clipboard clipboard) {
        this.clipboard = clipboard;
    }

    @Override
    public void invokeOn(StringBuilder text, int startIndex, int endIndex) {
        String substring = text.substring(startIndex, endIndex);
        clipboard.setCurrent(substring);
        text.replace(startIndex, endIndex, "");

    }
}
