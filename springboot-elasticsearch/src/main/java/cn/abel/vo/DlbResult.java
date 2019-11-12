package cn.abel.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DlbResult implements Serializable {

    private static final long serialVersionUID = 1L;

    private String result;
    private String data;
    private String error;
}
