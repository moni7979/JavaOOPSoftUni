package word;

public class pasteTransform implements TextTransform {

    private Clipboard clipboard;

    public pasteTransform(Clipboard clipboard) {
        this.clipboard = clipboard;
    }

    @Override
    public void invokeOn(StringBuilder text, int startIndex, int endIndex) {
        String clipboard = this.clipboard.getCurrent();
        text.replace(startIndex, endIndex, clipboard);
    }
}
