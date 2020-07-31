import React from 'react';
import Link from 'next/link'
import Head from 'next/head'
import { Container } from '../styles/homeStyle'

const Home = () => (
	<Container>
		<Head>
			<title>Home</title>
		</Head>
		<h1>Hello World</h1>
		<img src='/static/baixados.jpeg' width='200' />
		<Link href='/users'><a>View users</a></Link>
	</Container>
)

export default Home
