import Document, { Head, Main, NextScript } from 'next/document'

class MyDocument extends Document {
	render() {
		return (
			<html>
				<Head>
					<style>{`body {background-color: #7159ac;}`}</style>
				</Head>
				<body>
					<Main />
					<NextScript />
				</body>
			</html>
		)
	}
}

export default MyDocument
