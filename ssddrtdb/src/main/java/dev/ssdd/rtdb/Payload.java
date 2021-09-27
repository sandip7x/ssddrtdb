package dev.ssdd.rtdb;

public class Payload {
    /**
     * Opcode of the payload
     */
    private int opcode;

    /**
     * Data included into the payload
     */
    private byte[] data;

    /**
     * Initializes the variables
     *
     * @param opcode
     * @param data
     */
    public Payload(int opcode, byte[] data) {
        this.opcode = opcode;
        this.data = data;
    }

    /**
     * Returns the opcode
     *
     * @return
     */
    public int getOpcode() {
        return opcode;
    }

    /**
     * Returns the data
     *
     * @return
     */
    public byte[] getData() {
        return data;
    }
}