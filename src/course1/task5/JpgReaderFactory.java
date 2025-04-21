package course1.task5;

class JpgReaderFactory extends ImageReaderFactory {
    @Override
    public ImageReader createImageReader() {
        return new JpgReader();
    }
}
