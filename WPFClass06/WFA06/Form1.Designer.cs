namespace WFA06
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.btnMensagem = new System.Windows.Forms.Button();
            this.lblMensagem = new System.Windows.Forms.Label();
            this.button1 = new System.Windows.Forms.Button();
            this.btnExibirDia = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // btnMensagem
            // 
            this.btnMensagem.Location = new System.Drawing.Point(15, 170);
            this.btnMensagem.Name = "btnMensagem";
            this.btnMensagem.Size = new System.Drawing.Size(112, 54);
            this.btnMensagem.TabIndex = 0;
            this.btnMensagem.Text = "Clique aqui";
            this.btnMensagem.UseVisualStyleBackColor = true;
            this.btnMensagem.Click += new System.EventHandler(this.btnMensagem_Click);
            // 
            // lblMensagem
            // 
            this.lblMensagem.AutoSize = true;
            this.lblMensagem.Location = new System.Drawing.Point(12, 85);
            this.lblMensagem.Name = "lblMensagem";
            this.lblMensagem.Size = new System.Drawing.Size(58, 13);
            this.lblMensagem.TabIndex = 1;
            this.lblMensagem.Text = "mensagem";
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(161, 170);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(112, 54);
            this.button1.TabIndex = 2;
            this.button1.Text = "Mensagem";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // btnExibirDia
            // 
            this.btnExibirDia.Location = new System.Drawing.Point(309, 170);
            this.btnExibirDia.Name = "btnExibirDia";
            this.btnExibirDia.Size = new System.Drawing.Size(116, 54);
            this.btnExibirDia.TabIndex = 3;
            this.btnExibirDia.Text = "Exibir Dia";
            this.btnExibirDia.UseVisualStyleBackColor = true;
            this.btnExibirDia.Click += new System.EventHandler(this.btnExibirDia_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(437, 236);
            this.Controls.Add(this.btnExibirDia);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.lblMensagem);
            this.Controls.Add(this.btnMensagem);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button btnMensagem;
        private System.Windows.Forms.Label lblMensagem;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Button btnExibirDia;
    }
}

