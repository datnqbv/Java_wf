-- Tạo cơ sở dữ liệu mới
CREATE DATABASE EmployeeManagementNew4;
GO

-- Sử dụng cơ sở dữ liệu vừa tạo
USE EmployeeManagementNew4;
GO

-- Tạo bảng Add_Employee
CREATE TABLE Add_Employee (
    Employee_ID INT PRIMARY KEY,
    Employee_Department NVARCHAR(50),
    Name_Of_Employee NVARCHAR(100),
    Date_Of_Birth DATE,
    Phone_Number NVARCHAR(15),
    Email NVARCHAR(100),
    Basic_salary DECIMAL(10, 2),
    Address NVARCHAR(255),
    Gender NVARCHAR(10)
);
go

-- Tạo bảng Salary
CREATE TABLE Salary (
    Employee_ID INT PRIMARY KEY,
    Pay_day DATE,
    Basic_salary DECIMAL(10, 2),
    Bonus DECIMAL(10, 2),
    Coefficients_salary DECIMAL(5, 2),
    Salary DECIMAL(15, 2),
    FOREIGN KEY (Employee_ID) REFERENCES Add_Employee(Employee_ID) ON DELETE CASCADE
);
go

-- Tạo bảng Attendence
CREATE TABLE Attendence (
    Employee_ID INT,
    Attendence_Date DATE,
    FOREIGN KEY (Employee_ID) REFERENCES Add_Employee(Employee_ID) ON DELETE CASCADE
);
go

-- Tạo bảng Login
CREATE TABLE Login (
    UserName NVARCHAR(50) PRIMARY KEY,
    Password NVARCHAR(255)
);
go


-- Xóa bảng Employee_Project
DROP TABLE IF EXISTS Employee_Project;
go

-- Xóa bảng Project
DROP TABLE IF EXISTS Project;
go

-- Tạo lại bảng Project với thông tin tích hợp
CREATE TABLE Project (
    Employee_ID INT PRIMARY KEY,
    Project_ID INT,
    Project_Name NVARCHAR(100),
    Role NVARCHAR(50),
    Start_Date DATE,
    End_Date DATE,
    Status NVARCHAR(50),
    FOREIGN KEY (Employee_ID) REFERENCES Add_Employee(Employee_ID) ON DELETE CASCADE
);
GO



-- Thêm dữ liệu vào bảng Add_Employee
INSERT INTO Add_Employee (Employee_ID, Employee_Department, Name_Of_Employee, Date_Of_Birth, Phone_Number, Email, Basic_salary, Address, Gender)
VALUES
(1, N'Quản lý', N'Phùng Tiến Đạt', '1990-01-01', '0123456789', 'a@example.com', 10000000, N'Hà Nội', 'Male'),
(2, N'Thực tập sinh', N'Nguyễn Thị Linh', '1985-05-15', '0987654321', 'b@example.com', 8000000, N'Hồ Chí Minh', 'Female'),
(3, N'Thư ký', N'Nguyễn Thị Trang', '1986-03-21', '0978123456', 'c@example.com', 8500000, N'Hà Nội', 'Female'),
(4, N'Giám đốc', N'Nguyễn Văn Tùng', '1987-09-11', '0961234567', 'd@example.com', 15000000, N'Đà Nẵng', 'Male'),
(5, N'Kế toán', N'Nguyễn Hà Anh', '1988-12-25', '0912345678', 'e@example.com', 9000000, N'Hải Phòng', 'Female');

-- Thêm dữ liệu vào bảng Salary
INSERT INTO Salary (Employee_ID, Pay_day, Basic_salary, Bonus, Coefficients_salary, Salary)
VALUES
(1, '2024-01-31', 10000000, 2000000, 1.2, 14400000),
(2, '2024-01-30', 8000000, 1000000, 1.1, 9900000),
(3, '2024-01-29', 8500000, 1500000, 1.15, 11575000),
(4, '2024-01-28', 15000000, 3000000, 1.25, 22500000),
(5, '2024-01-27', 9000000, 1800000, 1.2, 12960000);

-- Thêm dữ liệu vào bảng Attendence
INSERT INTO Attendence (Employee_ID, Attendence_Date)
VALUES
(1, '2024-11-15'),
(2, '2024-11-14'),
(3, '2024-11-13'),
(4, '2024-11-12'),
(5, '2024-11-11');

-- Thêm dữ liệu vào bảng Login
INSERT INTO Login (UserName, Password)
VALUES
('admin', '12345'),
('admin2', '12345');
go

INSERT INTO Project (Employee_ID, Project_ID, Project_Name, Role, Start_Date, End_Date, Status)
VALUES
(1, 1, 'Project Beta', 'Manager', '2024-02-01', '2024-07-31', 'Completed'),
(2, 1, 'Project Gamma', 'Tester', '2024-03-01', '2024-08-31', 'Pending');
GO


-- Tạo trigger để cập nhật bảng Salary khi dữ liệu bảng Add_Employee thay đổi
CREATE TRIGGER trg_UpdateEmployee
ON Add_Employee
AFTER UPDATE
AS
BEGIN
    UPDATE Salary
    SET Basic_salary = INSERTED.Basic_salary
    FROM Salary
    INNER JOIN INSERTED ON Salary.Employee_ID = INSERTED.Employee_ID;

    UPDATE Attendence
    SET Attendence_Date = GETDATE()
    FROM Attendence
    INNER JOIN INSERTED ON Attendence.Employee_ID = INSERTED.Employee_ID;
END;
