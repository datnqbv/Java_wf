
package main;

import java.awt.Color;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import login.Login;
import model.ProjectManagement2;

public class Project2 extends javax.swing.JFrame {

    public Project2() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Projects = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btn_add = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_remove = new javax.swing.JButton();
        btn_view = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_search = new javax.swing.JButton();
        jRadioButtonn_EmployeeID = new javax.swing.JRadioButton();
        jRadioButton_ProjectID = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_projectName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_stDate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_endDate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jcb_role = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jcb_status = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txt_projectID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Project");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 600));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/project.png"))); // NOI18N
        jLabel1.setText("Project");

        jButton7.setBackground(new java.awt.Color(255, 102, 0));
        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/log-out.png"))); // NOI18N
        jButton7.setText("Log out");
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 626, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1020, 80);

        jPanel5.setBackground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(0, 570, 1020, 50);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jTable_Projects.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Employee ID", "Project ID", "Project Name", "Role", "Start Date", "End Date", "Status"
            }
        ));
        jTable_Projects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_ProjectsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Projects);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Commands", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(255, 51, 51))); // NOI18N

        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_remove.setText("Remove");
        btn_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeActionPerformed(evt);
            }
        });

        btn_view.setText("View");
        btn_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewActionPerformed(evt);
            }
        });

        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        jRadioButtonn_EmployeeID.setText("Employee ID");
        jRadioButtonn_EmployeeID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonn_EmployeeIDMouseClicked(evt);
            }
        });

        jRadioButton_ProjectID.setText("Project ID");
        jRadioButton_ProjectID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton_ProjectIDMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_clear, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(btn_back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_view, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_remove, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_update, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_add, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(btn_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButtonn_EmployeeID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton_ProjectID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonn_EmployeeID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton_ProjectID)
                .addGap(18, 18, 18)
                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_view, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Infomation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel3.setText("Employee ID: ");

        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        jLabel4.setText("Project Name: ");

        jLabel5.setText("Start Date: ");

        jLabel6.setText("End Date: ");

        jLabel7.setText("Role: ");

        jcb_role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Leader", "Tester", "Designer ", "Developer", "Manager" }));

        jLabel8.setText("Status");

        jcb_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ongoing", "Completed", "Pending" }));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Project ID:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_projectName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_stDate)
                    .addComponent(txt_endDate)
                    .addComponent(jcb_role, 0, 262, Short.MAX_VALUE)
                    .addComponent(jcb_status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_projectID))))
                .addGap(14, 14, 14))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_projectID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_projectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_stDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_endDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcb_role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcb_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 80, 1000, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
       // Lấy giá trị từ các trường nhập liệu
    String idText = txt_id.getText().trim();
    String projectIdText = txt_projectID.getText().trim();

    // Kiểm tra nếu ID nhân viên và mã dự án bị trống
    boolean isValid = true; // Biến để kiểm tra tính hợp lệ
    if (idText.isEmpty() || projectIdText.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ mã nhân viên và mã dự án.");
        if (idText.isEmpty()) {
            txt_id.setBackground(Color.PINK); // Đổi màu nền của ô ID thành màu hồng
        } else {
            txt_id.setBackground(Color.WHITE); // Đặt lại màu nền nếu không trống
        }
        if (projectIdText.isEmpty()) {
            txt_projectID.setBackground(Color.PINK); // Đổi màu nền của ô mã dự án thành màu hồng
        } else {
            txt_projectID.setBackground(Color.WHITE); // Đặt lại màu nền nếu không trống
        }
        return;
    } else {
        txt_id.setBackground(Color.WHITE); // Đặt lại màu nền của ô ID
        txt_projectID.setBackground(Color.WHITE); // Đặt lại màu nền của ô mã dự án
    }

    // Chuyển đổi từ chuỗi sang số sau khi kiểm tra rỗng
    int employeeId = 0;
    int projectId = 0;
    try {
        employeeId = Integer.parseInt(idText);  // Chuyển đổi id thành int
        projectId = Integer.parseInt(projectIdText);  // Chuyển đổi projectId thành int
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Mã nhân viên và mã dự án phải là số nguyên hợp lệ.");
        txt_id.setBackground(Color.PINK);  // Đổi màu nền của ô ID thành màu hồng nếu không hợp lệ
        txt_projectID.setBackground(Color.PINK);  // Đổi màu nền của ô mã dự án thành màu hồng nếu không hợp lệ
        return;
    }
    
    String projectName = txt_projectName.getText().trim();

    // Lấy giá trị từ JComboBox (Role và Status)
    String role = (String) jcb_role.getSelectedItem();
    String status = (String) jcb_status.getSelectedItem();

    // Lấy giá trị từ các trường ngày
    String startDate = txt_stDate.getText().trim();
    String endDate = txt_endDate.getText().trim();

    // Kiểm tra nếu các trường nhập liệu không trống
    StringBuilder errorMessage = new StringBuilder();
    if (projectName.isEmpty()) {
        errorMessage.append("Tên dự án không được để trống.\n");
        txt_projectName.setBackground(Color.PINK); // Đổi màu nền của ô tên dự án thành màu hồng
        isValid = false;
    } else {
        txt_projectName.setBackground(Color.WHITE); // Đặt lại màu nền nếu không trống
    }
    if (role == null) {
        errorMessage.append("Vui lòng chọn vai trò.\n");
        isValid = false;
    }
    if (status == null) {
        errorMessage.append("Vui lòng chọn tình trạng.\n");
        isValid = false;
    }
    if (startDate.isEmpty()) {
        errorMessage.append("Ngày bắt đầu không được để trống.\n");
        txt_stDate.setBackground(Color.PINK); // Đổi màu nền của ô ngày bắt đầu thành màu hồng
        isValid = false;
    } else {
        txt_stDate.setBackground(Color.WHITE); // Đặt lại màu nền nếu không trống
    }
    if (endDate.isEmpty()) {
        errorMessage.append("Ngày kết thúc không được để trống.\n");
        txt_endDate.setBackground(Color.PINK); // Đổi màu nền của ô ngày kết thúc thành màu hồng
        isValid = false;
    } else {
        txt_endDate.setBackground(Color.WHITE); // Đặt lại màu nền nếu không trống
    }

    if (!isValid) {
        JOptionPane.showMessageDialog(null, errorMessage.toString(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Kiểm tra định dạng ngày
    String[] dateFormats = {"dd/MM/yyyy", "dd-MM-yyyy", "dd/MM/yyyy HH:mm:ss", "yyyy-MM-dd"};
    Date startParsedDate = null;
    Date endParsedDate = null;
    boolean isStartDateValid = false;
    boolean isEndDateValid = false;

    // Kiểm tra ngày bắt đầu
    for (String format : dateFormats) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        sdf.setLenient(false);  // Kiểm tra ngày hợp lệ
        try {
            startParsedDate = sdf.parse(startDate);  // Kiểm tra ngày bắt đầu
            isStartDateValid = true;
            break;  // Nếu ngày bắt đầu hợp lệ, không kiểm tra tiếp các định dạng khác
        } catch (ParseException e) {
            // Tiếp tục kiểm tra định dạng khác nếu ngày không hợp lệ
        }
    }

    if (!isStartDateValid) {
        JOptionPane.showMessageDialog(null, "Ngày bắt đầu không hợp lệ. Vui lòng nhập theo định dạng dd/MM/yyyy, dd-MM-yyyy, yyyy-MM-dd hoặc dd/MM/yyyy HH:mm:ss.");
        txt_stDate.setBackground(Color.PINK); // Đổi màu nền nếu ngày không hợp lệ
        return;
    }

    // Kiểm tra ngày kết thúc
    for (String format : dateFormats) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        sdf.setLenient(false);
        try {
            endParsedDate = sdf.parse(endDate);  // Kiểm tra ngày kết thúc
            isEndDateValid = true;
            break;
        } catch (ParseException e) {
            // Tiếp tục kiểm tra định dạng khác nếu ngày không hợp lệ
        }
    }

    if (!isEndDateValid) {
        JOptionPane.showMessageDialog(null, "Ngày kết thúc không hợp lệ. Vui lòng nhập theo định dạng dd/MM/yyyy, dd-MM-yyyy, yyyy-MM-dd hoặc dd/MM/yyyy HH:mm:ss.");
        txt_endDate.setBackground(Color.PINK); // Đổi màu nền nếu ngày không hợp lệ
        return;
    }

    // Kiểm tra xem ngày bắt đầu có lớn hơn ngày kết thúc không
    if (startParsedDate.after(endParsedDate)) {
        JOptionPane.showMessageDialog(null, "Ngày bắt đầu không thể lớn hơn ngày kết thúc.");
        return;
    }

    // Chuyển đổi ngày về định dạng chuẩn trước khi thêm vào cơ sở dữ liệu
    SimpleDateFormat dbFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String formattedStartDate = dbFormat.format(startParsedDate);
    String formattedEndDate = dbFormat.format(endParsedDate);

    try {
        // Gọi phương thức thêm dự án từ ProjectManagement2
        ProjectManagement2 pm2 = new ProjectManagement2();
        boolean success = pm2.addProject(employeeId, projectId, projectName, role, formattedStartDate, formattedEndDate, status);

        if (success) {
            JOptionPane.showMessageDialog(null, "Dự án đã được thêm thành công!");
            loadTableData();
            clearFields(); // Xóa các trường dữ liệu sau khi thêm thành công

            // Đặt lại màu nền của tất cả các ô về mặc định (trắng)
           
        } else {
            JOptionPane.showMessageDialog(null, "Thêm dự án không thành công. Vui lòng kiểm tra lại.");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Lỗi khi thêm dự án: " + ex.getMessage());
    }
    
    }//GEN-LAST:event_btn_addActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.dispose();
        login.Login loginForm = new Login();
        loginForm.setLocationRelativeTo(null);
        loginForm.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed
  

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        clearFields();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        try {
            ProjectManagement2 pm2 = new ProjectManagement2();
            ResultSet rs;

            // Xác định tiêu chí tìm kiếm dựa trên RadioButton được chọn
            if (jRadioButtonn_EmployeeID.isSelected()) {
                String employeeId = txt_id.getText().trim();
                if (employeeId.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập Employee ID!");
                    return;
                }
                rs = pm2.searchProject("Employee_ID", employeeId);
            } else if (jRadioButton_ProjectID.isSelected()) {
                String projectId = txt_projectID.getText().trim();
                if (projectId.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập Project ID!");
                    return;
                }
                rs = pm2.searchProject("Project_ID", projectId);
            } else {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn tiêu chí tìm kiếm!");
                return;
            }

            // Hiển thị dữ liệu tìm được lên jTable
            DefaultTableModel model = (DefaultTableModel) jTable_Projects.getModel();
            model.setRowCount(0); // Xóa dữ liệu cũ

            while (rs.next()) {
                Object[] row = {
                    rs.getInt("Employee_ID"),
                    rs.getInt("Project_ID"),
                    rs.getString("Project_Name"),
                    rs.getString("Role"),
                    rs.getString("Start_Date"),
                    rs.getString("End_Date"),
                    rs.getString("Status")
                };
                model.addRow(row);
            }

            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Không tìm thấy dữ liệu!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi khi tìm kiếm: " + ex.getMessage());
        }
        clearFields();
        resetFields();
    }//GEN-LAST:event_btn_searchActionPerformed

    private void jRadioButtonn_EmployeeIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonn_EmployeeIDMouseClicked
        jRadioButton_ProjectID.setSelected(false); 
        enableFields(true, false);
        txt_id.requestFocus(); 
    }//GEN-LAST:event_jRadioButtonn_EmployeeIDMouseClicked

    private void jRadioButton_ProjectIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton_ProjectIDMouseClicked
        jRadioButtonn_EmployeeID.setSelected(false);
        enableFields(false, true);
        txt_projectID.requestFocus(); 
    }//GEN-LAST:event_jRadioButton_ProjectIDMouseClicked

    private void btn_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewActionPerformed
        loadTableData();
    }//GEN-LAST:event_btn_viewActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
         try {
        // Lấy giá trị từ các trường nhập liệu và JComboBox
        String idText = txt_id.getText().trim();
        String projectIdText = txt_projectID.getText().trim();
        String projectName = txt_projectName.getText().trim();

        // Kiểm tra nhập liệu
        if (idText.isEmpty() || projectIdText.isEmpty() || projectName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ mã nhân viên, mã dự án và tên dự án!");
            // Đánh dấu màu đỏ các trường thiếu dữ liệu
            if (idText.isEmpty()) {
                txt_id.setBackground(Color.PINK);
            } else {
                txt_id.setBackground(Color.WHITE);
            }
            if (projectIdText.isEmpty()) {
                txt_projectID.setBackground(Color.PINK);
            } else {
                txt_projectID.setBackground(Color.WHITE);
            }
            if (projectName.isEmpty()) {
                txt_projectName.setBackground(Color.PINK);
            } else {
                txt_projectName.setBackground(Color.WHITE);
            }
            return;
        }

        // Chuyển đổi mã nhân viên và mã dự án từ chuỗi thành số nguyên
        int employeeId = Integer.parseInt(idText);
        int projectId = Integer.parseInt(projectIdText);

        // Lấy giá trị từ JComboBox (Role và Status)
        String role = (String) jcb_role.getSelectedItem();
        String status = (String) jcb_status.getSelectedItem();

        // Lấy giá trị từ các trường ngày
        String startDate = txt_stDate.getText().trim();
        String endDate = txt_endDate.getText().trim();

        // Kiểm tra các trường không được để trống
        if (role == null || status == null || startDate.isEmpty() || endDate.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin vai trò, tình trạng và ngày tháng!");

            // Đánh dấu màu đỏ các trường thiếu thông tin
            if (role == null) {
                jcb_role.setBackground(Color.PINK);
            } else {
                jcb_role.setBackground(Color.WHITE);
            }
            if (status == null) {
                jcb_status.setBackground(Color.PINK);
            } else {
                jcb_status.setBackground(Color.WHITE);
            }
            if (startDate.isEmpty()) {
                txt_stDate.setBackground(Color.PINK);
            } else {
                txt_stDate.setBackground(Color.WHITE);
            }
            if (endDate.isEmpty()) {
                txt_endDate.setBackground(Color.PINK);
            } else {
                txt_endDate.setBackground(Color.WHITE);
            }
            return;
        }

        // Kiểm tra và chuẩn hóa ngày tháng
        String[] dateFormats = {"dd/MM/yyyy", "dd-MM-yyyy", "dd/MM/yyyy HH:mm:ss", "yyyy-MM-dd"};
        Date startParsedDate = null;
        Date endParsedDate = null;
        boolean isStartDateValid = false;
        boolean isEndDateValid = false;

        // Kiểm tra ngày bắt đầu
        for (String format : dateFormats) {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            sdf.setLenient(false); // Kiểm tra ngày hợp lệ
            try {
                startParsedDate = sdf.parse(startDate);
                isStartDateValid = true;
                break;
            } catch (ParseException e) {
                // Tiếp tục kiểm tra các định dạng khác
            }
        }

        if (!isStartDateValid) {
            JOptionPane.showMessageDialog(this, "Ngày bắt đầu không hợp lệ. Vui lòng nhập theo định dạng dd/MM/yyyy, dd-MM-yyyy, yyyy-MM-dd hoặc dd/MM/yyyy HH:mm:ss.");
            txt_stDate.setBackground(Color.PINK); // Đánh dấu ô ngày bắt đầu
            return;
        }

        // Kiểm tra ngày kết thúc
        for (String format : dateFormats) {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            sdf.setLenient(false);
            try {
                endParsedDate = sdf.parse(endDate);
                isEndDateValid = true;
                break;
            } catch (ParseException e) {
                // Tiếp tục kiểm tra các định dạng khác
            }
        }

        if (!isEndDateValid) {
            JOptionPane.showMessageDialog(this, "Ngày kết thúc không hợp lệ. Vui lòng nhập theo định dạng dd/MM/yyyy, dd-MM-yyyy, yyyy-MM-dd hoặc dd/MM/yyyy HH:mm:ss.");
            txt_endDate.setBackground(Color.PINK); // Đánh dấu ô ngày kết thúc
            return;
        }

        // Kiểm tra ngày bắt đầu có lớn hơn ngày kết thúc không
        if (startParsedDate.after(endParsedDate)) {
            JOptionPane.showMessageDialog(this, "Ngày bắt đầu không thể lớn hơn ngày kết thúc.");
            return;
        }

        // Chuyển đổi ngày về định dạng chuẩn trước khi lưu vào cơ sở dữ liệu
        SimpleDateFormat dbFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedStartDate = dbFormat.format(startParsedDate);
        String formattedEndDate = dbFormat.format(endParsedDate);

        // Gọi phương thức cập nhật dự án từ ProjectManagement2
        ProjectManagement2 pm2 = new ProjectManagement2();
        boolean success = pm2.updateProject(employeeId, projectId, projectName, role, formattedStartDate, formattedEndDate, status);

        if (success) {
            JOptionPane.showMessageDialog(this, "Dự án đã được cập nhật thành công!");
            loadTableData(); // Cập nhật lại dữ liệu trên JTable
        } else {
            JOptionPane.showMessageDialog(this, "Cập nhật dự án không thành công. Vui lòng kiểm tra lại.");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Lỗi khi cập nhật dự án: " + ex.getMessage());
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Mã nhân viên và mã dự án phải là số nguyên. Vui lòng kiểm tra lại!");
    }
    clearFields();
    }//GEN-LAST:event_btn_updateActionPerformed

    private void jTable_ProjectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_ProjectsMouseClicked
         // Lấy dòng được chọn
        int selectedRow = jTable_Projects.getSelectedRow();

        // Kiểm tra xem có dòng nào được chọn không
        if (selectedRow != -1) {
            // Lấy model của bảng
            DefaultTableModel model = (DefaultTableModel) jTable_Projects.getModel();

            // Lấy dữ liệu từ các cột của dòng được chọn
            String employeeId = model.getValueAt(selectedRow, 0).toString();
            String projectId = model.getValueAt(selectedRow, 1).toString();
            String projectName = model.getValueAt(selectedRow, 2).toString();
            String role = model.getValueAt(selectedRow, 3).toString();
            String startDate = model.getValueAt(selectedRow, 4).toString();
            String endDate = model.getValueAt(selectedRow, 5).toString();
            String status = model.getValueAt(selectedRow, 6).toString();

            // Hiển thị dữ liệu lên các trường nhập liệu
            txt_id.setText(employeeId);
            txt_projectID.setText(projectId);
            txt_projectName.setText(projectName);
            jcb_role.setSelectedItem(role); // Đặt giá trị đã chọn cho JComboBox role
            txt_stDate.setText(startDate);
            txt_endDate.setText(endDate);
            jcb_status.setSelectedItem(status); // Đặt giá trị đã chọn cho JComboBox status
        }
        resetFields();
    }//GEN-LAST:event_jTable_ProjectsMouseClicked

    private void btn_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeActionPerformed
        // Lấy dòng được chọn trong bảng
        int selectedRow = jTable_Projects.getSelectedRow();

        // Kiểm tra nếu chưa có dòng nào được chọn
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn một dòng để xóa!");
            return;
        }

        // Lấy Employee_ID và Project_ID từ dòng được chọn
        DefaultTableModel model = (DefaultTableModel) jTable_Projects.getModel();
        int employeeId = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());
        int projectId = Integer.parseInt(model.getValueAt(selectedRow, 1).toString());

        // Hiển thị hộp thoại xác nhận
        int confirm = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa dự án này?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        // Gọi phương thức xóa dự án từ `ProjectManagement2`
        try {
            ProjectManagement2 pm2 = new ProjectManagement2();
            boolean success = pm2.removeProject(employeeId, projectId);

            if (success) {
                // Cập nhật lại bảng sau khi xóa thành công
                model.removeRow(selectedRow);
                JOptionPane.showMessageDialog(null, "Dự án đã được xóa thành công!");
            } else {
                JOptionPane.showMessageDialog(null, "Xóa dự án không thành công. Vui lòng kiểm tra lại.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi khi xóa dự án: " + ex.getMessage());
        }
        clearFields();
    }//GEN-LAST:event_btn_removeActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        this.dispose();
        main.Main mainFrm = new Main();
        mainFrm.setLocationRelativeTo(null);
        mainFrm.setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed
    
    private void loadTableData() {
        try {
            // Kết nối và truy vấn toàn bộ dữ liệu từ bảng Project
            ProjectManagement2 pm2 = new ProjectManagement2();
            ResultSet rs = pm2.searchProject("ALL", ""); // Tùy chọn hiển thị toàn bộ dữ liệu

            // Xóa dữ liệu cũ trên bảng
            DefaultTableModel model = (DefaultTableModel) jTable_Projects.getModel();
            model.setRowCount(0); // Xóa toàn bộ các dòng

            // Lặp qua kết quả ResultSet và thêm từng dòng vào bảng
            while (rs.next()) {
                Object[] row = {
                    rs.getInt("Employee_ID"),
                    rs.getInt("Project_ID"),
                    rs.getString("Project_Name"),
                    rs.getString("Role"),
                    rs.getString("Start_Date"),
                    rs.getString("End_Date"),
                    rs.getString("Status")
                };
                model.addRow(row);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi khi tải dữ liệu: " + ex.getMessage());
        }
    }
    private void clearFields() {
        txt_id.setText("");
        txt_projectID.setText("");
        txt_projectName.setText("");
        txt_stDate.setText("");
        txt_endDate.setText("");
        
        txt_id.setBackground(Color.WHITE);
        txt_projectID.setBackground(Color.WHITE);
         txt_projectName.setBackground(Color.WHITE);
        txt_stDate.setBackground(Color.WHITE);
        txt_endDate.setBackground(Color.WHITE);

        jcb_role.setSelectedIndex(0); // Đặt về mục đầu tiên trong danh sách
        jcb_status.setSelectedIndex(0); // Đặt về mục đầu tiên trong danh sách
    }
    private void enableFields(boolean enableId, boolean enableProjectId) {
        txt_id.setEnabled(enableId);
        txt_projectID.setEnabled(enableProjectId);
        txt_projectName.setEnabled(false);
        txt_stDate.setEnabled(false);
        txt_endDate.setEnabled(false);
        jcb_role.setEnabled(false);
        jcb_status.setEnabled(false);
    }
    private void resetFields() {
        // Mở khóa tất cả các text field và combobox
        txt_id.setEnabled(true);
        txt_projectID.setEnabled(true);
        txt_projectName.setEnabled(true);
        txt_stDate.setEnabled(true);
        txt_endDate.setEnabled(true);
        jcb_role.setEnabled(true);
        jcb_status.setEnabled(true);

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Project2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Project2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Project2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Project2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Project2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_remove;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton btn_view;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton_ProjectID;
    private javax.swing.JRadioButton jRadioButtonn_EmployeeID;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Projects;
    private javax.swing.JComboBox<String> jcb_role;
    private javax.swing.JComboBox<String> jcb_status;
    private javax.swing.JTextField txt_endDate;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_projectID;
    private javax.swing.JTextField txt_projectName;
    private javax.swing.JTextField txt_stDate;
    // End of variables declaration//GEN-END:variables
}
