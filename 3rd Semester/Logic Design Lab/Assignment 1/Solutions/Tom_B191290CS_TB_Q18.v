module NotGate(a,b) ; 

output b ;
input a ;

nand(b,a,a) ;

endmodule 

module AndGate(a,b,c) ; 

output c ;
input a,b ;
wire x ;

nand(x,a,b);
nand(c,x,x) ;

endmodule 

module OrGate(a,b,c) ; 

output c ;
input a,b ;
wire x,y ;

nand(x,a,a) ;
nand(y,b,b) ;
nand(c,x,y) ;

endmodule

module DMux1x2(c,s,a,b) ; 

output a,b ;
input s,c ;
wire s_,x1,y1,x2,y2,z ;

NotGate NG_1(s,s_) ;

AndGate AG_0(c,s_,x1) ;
AndGate AG_0_0(z,s,y1) ;
OrGate OG1(y1,x1,a) ;

AndGate AG_1(c,s,x2) ;
AndGate AG_1_0(z,s_,y2) ;
OrGate OG2(y2,x2,b) ;

endmodule 

module DMux1x4(o,s,i0,i1,i2,i3) ;	

output i0,i1,i2,i3 ;
input o ;
input [1:0] s ; 
wire a,b ;

DMux1x2 D_0(o,s[1],a,b) ;
DMux1x2 D_1(a,s[0],i0,i1) ;
DMux1x2 D_2(b,s[0],i2,i3) ;

endmodule

module DMux1x8(o,s,i0,i1,i2,i3,i4,i5,i6,i7) ;
output i0,i1,i2,i3,i4,i5,i6,i7;
input o;
input [2:0] s;
wire a,b ;

DMux1x2 D_0(o,s[2],a,b) ;
DMux1x4 D_1(a,s[1:0],i0,i1,i2,i3) ;
DMux1x4 D_2(b,s[1:0],i4,i5,i6,i7) ;

endmodule 

module Stim_Tom_B191290CS_TB_Q18 ;

wire i0,i1,i2,i3,i4,i5,i6,i7;
reg [2:0] s ;
reg o ;

DMux1x8 D(o,s,i0,i1,i2,i3,i4,i5,i6,i7) ;
initial 
begin 
for(s=0;s<7;s=s+1)
	begin
	o = 1'b0 ; #100 ;
	o = 1'b1 ; #100 ;
	end 
o = 1'b0 ; #100 ;
o = 1'b1 ; #100 ;
end 

endmodule 
