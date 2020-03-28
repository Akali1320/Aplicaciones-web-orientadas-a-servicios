<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm2.aspx.cs" Inherits="service.WebForm2" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
         <div>
            <asp:Label ID="Label1" runat="server" Text="La fecha es: "></asp:Label>
            <asp:Label ID="Fecha" runat="server"></asp:Label>
        </div>
        <div>
            <asp:Button ID="btn1" runat="server" Text="Ver Fecha y Hora" OnClick="btn1_Click" />
        </div>
    </form>
</body>
</html>
